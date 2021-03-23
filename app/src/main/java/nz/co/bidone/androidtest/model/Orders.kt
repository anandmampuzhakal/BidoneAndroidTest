package nz.co.bidone.androidtest.model

import java.io.Serializable
/**
 * @author Anand M Joseph (anandmampuzhakal@hotmail.com)
 */
data class Orders(val id: Int? = null,
                  val name: String? = null,
                  val userName: String? = null,
                  val email: String? = null,
                  val phone: String? = null,
                  val website: String? = null) : Serializable