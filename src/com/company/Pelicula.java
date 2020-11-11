package com.company;

public class Pelicula {
        private String titol;
        private int duracio;
        private String nomDirector;
        public Pelicula(String titol,int duracio, String nomDirector) {
            this.titol=titol;
            this.duracio = duracio;
            this.nomDirector = nomDirector;
        }
        public String getTitol(){
            return titol;
        }
        public int getDuracio(){
            return duracio;
        }
        public String getNomDirector(){
            return  nomDirector;
        }
    }


