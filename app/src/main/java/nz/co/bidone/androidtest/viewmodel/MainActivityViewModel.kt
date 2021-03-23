package nz.co.bidone.androidtest.viewmodel

import androidx.lifecycle.MutableLiveData
import com.nz.anand.mvvmlibrary.mvvm.MVVMBaseViewModel
import nz.co.bidone.androidtest.model.Order
import nz.co.bidone.androidtest.repository.ProductAPIRepository
/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
class MainActivityViewModel: MVVMBaseViewModel() {
    var listData = MutableLiveData<List<Order>>()
    init {
        val productAPIRepository: ProductAPIRepository by lazy {
            ProductAPIRepository
        }
        listData = productAPIRepository.getMutableLiveData()
    }
}
