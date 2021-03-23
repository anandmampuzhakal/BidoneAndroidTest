package nz.co.bidone.androidtest.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import nz.co.bidone.androidtest.model.Product
import nz.co.bidone.androidtest.R
/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class ProductAdapter (private var list: List<Product>): RecyclerView.Adapter<ProductAdapter.CommentsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentsHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.product_item,parent,false)
        return CommentsHolder(view)
    }

    override fun onBindViewHolder(holder: CommentsHolder, position: Int) {
        val comments = list[position]
        holder.productCode.text = comments.productCode.toString()
        holder.productBodyTxt.text = comments.description
        holder.brandTxt.text = comments.brand
        holder.priceTxt.text = comments.price.toString()
        holder.quantityTxt.text = comments.quantity.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class CommentsHolder( view: View) : RecyclerView.ViewHolder(view){
        var productCode: TextView = view.findViewById(R.id.product_code_txt)
        var productBodyTxt: TextView = view.findViewById(R.id.product_body_txt)
        var brandTxt: TextView = view.findViewById(R.id.brand_txt)
        var priceTxt: TextView = view.findViewById(R.id.price_txt)
        var quantityTxt: TextView = view.findViewById(R.id.quantity_txt)
    }
}