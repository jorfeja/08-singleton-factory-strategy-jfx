package ohm.softa.a08.api;

import com.google.gson.Gson;
import javafx.collections.FXCollections;
import ohm.softa.a08.model.Meal;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

/// Singleton
public class OpenMensaAPIService {

	private static final OpenMensaAPIService instance = new OpenMensaAPIService();

	private OpenMensaAPI mensaApiInstance;

	private OpenMensaAPIService() {
		/* initialize Retrofit instance */
		var retrofit = new Retrofit.Builder()
			.addConverterFactory(GsonConverterFactory.create())
			.baseUrl("http://openmensa.org/api/v2/")
			.build();

		/* create OpenMensaAPI instance */
		mensaApiInstance = retrofit.create(OpenMensaAPI.class);
	}

	public static OpenMensaAPIService getInstance() {
		return instance;
	}

	public OpenMensaAPI getApi() {
		return mensaApiInstance;
	}
}
