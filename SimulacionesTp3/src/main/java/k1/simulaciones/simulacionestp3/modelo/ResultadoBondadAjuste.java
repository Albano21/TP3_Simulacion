package k1.simulaciones.simulacionestp3.modelo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResultadoBondadAjuste {

    private  Intervalo[] distFrecuencia;
    private  List<Intervalo> distribucionChiCuadrado;
    private  List<IntervaloKS> distribucionKS;
    private  Pseudoaleatorio[] valoresGenerados;
    private  float estadisticoObsChiCuadrado;
    private  float estatisticoEspChiCuadrado;
    private  float estadisticoObsKS;
    private  float estatisticoEspKS;

    public int getN(){
        return valoresGenerados.length;
    }


}
