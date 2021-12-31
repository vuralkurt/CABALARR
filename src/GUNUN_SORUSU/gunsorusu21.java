package GUNUN_SORUSU;

//NELER OLUYOR YAV
//NEREDEN BILEYIMM
//HADI HADI BILIRSIN SENN
//NE BILECEM OGLUM BENN
    class A{
      public A(){
            System.out.println("A");
        }
    }

    class B extends A{
        public B(){
            System.out.println("B");
        }
    }
    class C extends B{
        public C(){
            System.out.println("C");
        }


    public static void main(String[] args) {
        C c =new C();
    }

    }
