package retrofitUtil;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofitData.Pokemon;

/**
 * Created by 21608838 on 17/01/2018.
 */

public interface APIRestService {
    public static final String BASE_URL = "https://pokeapi.co/api/v2/";

    @GET("pokemon/")
    Call<Pokemon> obtenerPokemon();

}
