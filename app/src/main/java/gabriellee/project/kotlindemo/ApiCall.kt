package gabriellee.project.kotlindemo

import io.reactivex.Observable
import retrofit2.http.GET

interface ApiCall {
    @GET("prices?key=370553d81dff8649a476a10175742657")
    fun getData() : Observable<List<Crypto>>
}