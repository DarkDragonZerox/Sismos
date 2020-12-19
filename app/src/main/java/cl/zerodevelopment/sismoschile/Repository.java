package cl.zerodevelopment.sismoschile;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {
    private static final String TAG ="Repository" ;
    private PresenterRepository presenterRepository;

    public void loadInfo(){
        RetrofitClient.getRetrofitInstance().getSismos().enqueue(new Callback<List<SismosLista>>() {
            @Override
            public void onResponse(Call<List<SismosLista>> call, Response<List<SismosLista>> response) {
                Log.d(TAG, "onResponse:  "+response.body());
                List<SismosLista> listaSismos= new ArrayList<>();
                for(int i = 0;i<response.body().size();i++){
                    listaSismos.add(response.body().get(i));
                    presenterRepository.showInfo(listaSismos);

                }
            }

            @Override
            public void onFailure(Call<List<SismosLista>> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.toString());
            }
        });
    }


}
