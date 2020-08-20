package edu.escuelaing.arep;

public class Calculadora {
        private ListaEnlazada listaEnlazada;
        public Calculadora(String[]datos) {
            listaEnlazada= new ListaEnlazada();
            for (String i: datos) {
                double temp;

                temp=Double.parseDouble(i);
                Puntero nuevo=new Puntero(temp);
                listaEnlazada.add(nuevo);
            }
        }
        /**
         * Este método se encarga de calcular la media de una lista enlazada.
         * @return Retorna El valor de la media de los datos presentes en la lista enlazada.
         */
        public double media() throws Exception{
            double res=0;
            if (listaEnlazada.getTamaño()==0){ throw new Exception("Datos erroneos");}
            else{
                Puntero i=listaEnlazada.iterador();
                while (i!=null){
                    res+=i.getValor();
                    i= listaEnlazada.iterador();
                }
                return res/ listaEnlazada.getTamaño();
            }

        }

        /**
         * Este método se encarga de calcular la desviación estandar de una lista enlazada.
         * @return El valor de la desviación estandar de los datos presentes en la lista enlazada.
         */
        public double desviacion() throws Exception {
            double media=media();
            double des=0;
            Puntero i= listaEnlazada.iterador();
            while (i != null) {
                des += Math.pow(i.getValor() - media, 2);
                i = listaEnlazada.iterador();
            }

            des=Math.sqrt(des/(listaEnlazada.getTamaño()));
            System.out.println(des);
            return des;
        }

    }


