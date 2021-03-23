package nz.co.bidone.androidtest.ui

import android.os.Bundle
import android.view.View
import com.nz.anand.mvvmlibrary.extension.viewDataBindingOf
import com.nz.anand.mvvmlibrary.extension.viewModelOf
import com.nz.anand.mvvmlibrary.mvvm.MVVMBaseFragment
import nz.co.bidone.androidtest.R
import nz.co.bidone.androidtest.adapters.OrdersAdapters
import nz.co.bidone.androidtest.databinding.FragmentOrdersListBinding
import nz.co.bidone.androidtest.model.Orders
import nz.co.bidone.androidtest.viewmodel.MainActivityViewModel
/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class OrdersFragment : MVVMBaseFragment(R.layout.fragment_orders_list){
    private val mViewModel: MainActivityViewModel by viewModelOf()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val db = viewDataBindingOf<FragmentOrdersListBinding>()
        mViewModel.listData.observe(viewLifecycleOwner){
            db.cardList.adapter = OrdersAdapters(it as List<Orders>)
        }
    }
}