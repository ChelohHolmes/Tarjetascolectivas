package com.example.chelohholmes.tarjetas_colectivas;

import java.util.ArrayList;

public class datos {
    public datos() {
    }

    public ArrayList<tarjetero> showAll()
    {
        ArrayList<tarjetero> resultado = new ArrayList<tarjetero>();

        tarjetero uno = new tarjetero();
        tarjetero dos = new tarjetero();
        tarjetero tres = new tarjetero();
        tarjetero cuatro = new tarjetero();
        tarjetero cinco = new tarjetero();
        tarjetero seis = new tarjetero();
        tarjetero siete = new tarjetero();
        tarjetero ocho = new tarjetero();
        tarjetero nueve = new tarjetero();
        tarjetero diez = new tarjetero();


        uno.Nombre = "Jorge";
        uno.Edad = "42";
        uno.Descripcion = "Le gustan las Sabritas.";
        uno.Imagen = ("https://thumb9.shutterstock.com/display_pic_with_logo/101595/738242395/stock-photo-portrait-of-a-mature-businessman-wearing-glasses-on-grey-background-happy-senior-latin-man-looking-738242395.jpg");
        uno.ID=0;

        dos.Nombre = "Waterguy";
        dos.Edad = "12";
        dos.Descripcion = "I mean, me too.";
        dos.Imagen = ("http://i0.kym-cdn.com/entries/icons/original/000/023/598/Waterguy_irl.jpg");
        dos.ID=1;

        tres.Nombre = "Esteban";
        tres.Edad = "18";
        tres.Descripcion = "No le gusta crecer.";
        tres.Imagen = ("https://thumb9.shutterstock.com/display_pic_with_logo/1020994/457511662/stock-photo-side-view-of-a-sad-man-with-a-hand-on-the-head-sitting-on-a-couch-in-the-living-room-at-home-457511662.jpg");
        tres.ID=2;

        cuatro.Nombre = "Pepe";
        cuatro.Edad = "17";
        cuatro.Descripcion = "Tiene un hermano gemelo con acne.";
        cuatro.Imagen = ("https://thumb1.shutterstock.com/display_pic_with_logo/137002/682205473/stock-photo-young-man-before-and-after-acne-treatment-on-white-background-skin-care-concept-682205473.jpg");
        cuatro.ID=3;

        cinco.Nombre = "Pedro";
        cinco.Edad = "17";
        cinco.Descripcion = "Tiene un hermano gemelo sin acne.";
        cinco.Imagen = ("https://thumb1.shutterstock.com/display_pic_with_logo/137002/682205473/stock-photo-young-man-before-and-after-acne-treatment-on-white-background-skin-care-concept-682205473.jpg");
        cinco.ID=4;

        seis.Nombre = "Miguel";
        seis.Edad = "25";
        seis.Descripcion = "Es cool.";
        seis.Imagen = ("https://thumb9.shutterstock.com/display_pic_with_logo/698308/567772042/stock-photo-headshot-of-successful-smiling-cheerful-african-american-businessman-executive-stylish-company-567772042.jpg");
        seis.ID=5;

        siete.Nombre = "Duke";
        siete.Edad = "Tres años perro";
        siete.Descripcion = "Es un perro.";
        siete.Imagen = ("https://thumb1.shutterstock.com/display_pic_with_logo/4305748/609815726/stock-photo-happy-curious-dog-mixed-breed-isolated-on-a-colorful-background-609815726.jpg");
        siete.ID=6;

        ocho.Nombre = "Andrés";
        ocho.Edad = "21";
        ocho.Descripcion = "Tiene una boy band.";
        ocho.Imagen = ("https://thumb1.shutterstock.com/display_pic_with_logo/2154986/769286080/stock-photo-a-studio-portrait-of-a-young-asian-man-making-a-confident-smile-769286080.jpg");
        ocho.ID=7;

        nueve.Nombre = "José";
        nueve.Edad = "28";
        nueve.Descripcion = "Le gusta pensar.";
        nueve.Imagen =("https://thumb9.shutterstock.com/display_pic_with_logo/816064/518953855/stock-photo-cropped-shot-of-thoughtful-young-man-standing-by-the-wall-518953855.jpg");
        nueve.ID=8;

        diez.Nombre = "Pablo";
        diez.Edad = "26";
        diez.Descripcion = "Le gusta señalar a la izquierda.";
        diez.Imagen = ("https://thumb7.shutterstock.com/display_pic_with_logo/1998197/439432054/stock-photo-look-over-there-happy-young-handsome-man-in-jeans-shirt-pointing-away-and-smiling-while-standing-439432054.jpg");
        diez.ID=9;

        resultado.add(uno);
        resultado.add(dos);
        resultado.add(tres);
        resultado.add(cuatro);
        resultado.add(cinco);
        resultado.add(seis);
        resultado.add(siete);
        resultado.add(ocho);
        resultado.add(nueve);
        resultado.add(diez);

        return resultado;
    }
}
