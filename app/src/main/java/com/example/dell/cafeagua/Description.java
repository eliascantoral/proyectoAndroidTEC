package com.example.dell.cafeagua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Description extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        String data = getIntent().getStringExtra("coffeid");
        ImageView picture = (ImageView) this.findViewById(R.id.imageView);
        TextView title = (TextView) this.findViewById(R.id.titleDescription);
        TextView description = (TextView) this.findViewById(R.id.description);
        TextView ads = (TextView) this.findViewById(R.id.ads);

        switch (data){
            case "0":
                picture.setImageResource(R.drawable.cappuccino);
                title.setText("Capuccino");
                description.setText("El capuchino (del italiano cappuccino) es una bebida italiana preparada con café expreso y leche montada con el vapor para crear la espuma (en ocasiones lleva cacao o canela en polvo). Un capuchino se compone de 125 ml de leche y 25 ml de café expreso. El capuchino, en las cafeterías de renombre, se sirve con una galleta o un bombón; aparte se sirve un vaso de agua con una cuchara. En Italia se consume mucho para el desayuno, junto con un croissant.");
                break;
            case "1":
                picture.setImageResource(R.drawable.latte);
                title.setText("Latte");
                description.setText("1 oz de espresso\n" +
                        "10 oc de Leche cremada\n" +
                        "Preparación: De máquina de espresso y la leche es cremada con la valvula de aire caliente.\n" +
                        "\n" +
                        "Claro, por tratarse de bebidas tan conocidas por todo el mundo puede haber variaciones, descripciones y formas para preparalo, en Francia le dicen “Grand crème” por ejemplo.\n" +
                        "\n" +
                        "Hoy surgió toda una polémica alrededor de estos términos, y por eso me atrevo a explicar mi postura con un poco más de detalle. Lo que me gustó precisamente de esta polémica es que siempre reinó el respeto entre todos los involucrados, ideologías diferentes intercambiadas de manera elegante es un mero reflejo de respeto al derecho ajeno.");
                break;
            case "2":
                picture.setImageResource(R.drawable.macchiato);
                title.setText("Macchiato");
                description.setText("El café manchado o caffè macchiato [kafˈfɛ (m)makˈkjaːto] en italiano, también llamado espresso macchiato, es un café cortado típico de Italia, consistente en un expreso con una pequeña cantidad de leche caliente y espumada. En España se suele denominar simplemente manchado.\n" +
                        "\n" +
                        "Macchiato ([makˈkjaːto]) significa en italiano ‘manchado’, y en el caso de caffè macchiato alude a la leche. Tradicionalmente se elaboraba con un tiro de leche normalmente caliente, siendo la «mancha» del cafe añadido. Sin embargo, más tarde macchiato pasó a aludir a la espuma del toque de leche que se ponía encima para indicar que la bebida tenía un poco de leche sobre mucho café. Esta era la forma en que los baristas señalaban a los camareros qué tazas contenían macchiato en lugar de expreso, puesto que en muchos países ha habido muchas suposiciones y confusiones sobre diferencias entre manchado y cortado y es que, el primer tipo se servia sobre tazas que estaban «manchadas».");
                break;
            case "3":
                picture.setImageResource(R.drawable.mocha);
                title.setText("Mocha");
                description.setText("Un café moca es una variante del café con leche. Como éste, suele llevar un tercio de expreso y dos tercios de leche vaporizada, pero se añade una parte de chocolate, normalmente en forma de jarabe de chocolate, si bien algunas máquinas usan chocolate en polvo instantáneo. Los mocas contienen chocolate negro o con leche.\n" +
                        "\n" +
                        "Como el capuchino, el moca tiene la famosa espuma de leche encima, aunque a veces se sirve con crema de leche en su lugar. Suele espolvorearse con canela o cacao. También pueden añadirse malvaviscos encima para decorar y dar sabor.\n" +
                        "\n" +
                        "Una variante es el café moca blanco, hecho con chocolate blanco en lugar de negro o con leche. Hay también variantes en las que se mezclan los dos jarabes, mezcla que se conoce con distintos nombres, incluyendo «moca blanco y negro», «moca moreno» y «cebra».");
                break;
        }

        WebView myWebView = (WebView) findViewById(R.id.webviewbox);
        myWebView.loadUrl("https://www.google.com.gt/maps/@14.5824309,-90.5210567,15z?hl=es-419");

    }
}
