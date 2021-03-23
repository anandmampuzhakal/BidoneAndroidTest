package nz.co.bidone.androidtest.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kingfisher.easyviewindicator.RecyclerViewIndicator
import nz.co.bidone.androidtest.model.Product
import nz.co.bidone.androidtest.model.Order
import nz.co.bidone.androidtest.R
import nz.co.bidone.androidtest.model.Orders
/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class OrdersAdapters(private var list: List<Orders>) : RecyclerView.Adapter<OrdersAdapters.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.card_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val order = list[position] as Order
        holder.orderDescriptionTxt.text = order.description
        holder.orderDate.text = order.orderDate
        holder.deliveryDate.text = order.deliveryDate
        holder.totalAmtTxt.text = order.getOrderTotal().toString()

        setCommentsList(order.products,holder)
        holder.postButton.setOnClickListener {
            if(holder.postButton.text.toString().trim() == holder.productRecyclerview.context.getString(R.string.show_products)){
                holder.postButton.text = holder.productRecyclerview.context.getString(R.string.hide_products)
                holder.productRecyclerview.visibility = View.VISIBLE
                holder.recyclerViewIndicator.visibility = View.VISIBLE
            }else{
                holder.postButton.text = holder.productRecyclerview.context.getString(R.string.show_products)
                holder.productRecyclerview.visibility = View.GONE
                holder.recyclerViewIndicator.visibility = View.GONE
            }
        }
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var orderDescriptionTxt: TextView = view.findViewById(R.id.order_description_txt)
        var orderDate: TextView = view.findViewById(R.id.order_date_txt)
        var deliveryDate: TextView = view.findViewById(R.id.delivery_date_txt)
        var totalAmtTxt: TextView = view.findViewById(R.id.total_amt_txt)


        var productRecyclerview: RecyclerView = view.findViewById(R.id.product_list)
        var recyclerViewIndicator: RecyclerViewIndicator = view.findViewById(R.id.circleIndicator)
        lateinit var productAdapter: ProductAdapter
        var postButton: Button = view.findViewById(R.id.show_products_btn)
    }
       private fun setCommentsList(
           product: List<Product>,
           holder: MyViewHolder
    ) {
        if (product.isNotEmpty()) {
            val verticalLayout =
                LinearLayoutManager(
                    holder.productRecyclerview.context,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
            val linearLayoutManager = LinearLayoutManager(holder.productRecyclerview.context)
            holder.productRecyclerview.layoutManager = linearLayoutManager
            holder.productRecyclerview.layoutManager = verticalLayout
            holder.productAdapter = ProductAdapter(product)
            holder.productRecyclerview.adapter = holder.productAdapter
            holder.recyclerViewIndicator.setRecyclerView( holder.productRecyclerview)
            holder.recyclerViewIndicator.forceUpdateItemCount()
            holder.postButton.text = holder.productRecyclerview.context.getString(R.string.hide_products)
            holder.productRecyclerview.visibility = View.VISIBLE
            holder.recyclerViewIndicator.visibility = View.VISIBLE
        } else {
            holder.postButton.text = holder.productRecyclerview.context.getString(R.string.show_products)
            holder.productRecyclerview.visibility = View.GONE
            holder.recyclerViewIndicator.visibility = View.GONE
        }
    }
}