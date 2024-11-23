package TTUD.AimsProject;

public class TestPassingParameter {

    public static class Wrapper<T> {
        public T value;

        public Wrapper(T value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        
        // DigitalVideoDisc jungleDvd = new DigitalVideoDisc("Jungle");
        // DigitalVideoDisc cinderellaDvd = new DigitalVideoDisc("Cinderella");

        Wrapper<DigitalVideoDisc> jungleDvd = new Wrapper<>(new DigitalVideoDisc("Jungle"));
        Wrapper<DigitalVideoDisc> cinderellaDvd = new Wrapper<>(new DigitalVideoDisc("Cinderella"));

        swap(jungleDvd, cinderellaDvd);

        System.out.println("jungle dvd title: "+ jungleDvd.value.getTitle());
        System.out.println("cinderella dvd title: "+ cinderellaDvd.value.getTitle());

        //changeTitle(jungleDvd, cinderellaDvd.getTitle());
        System.out.println("jungle dvd title: "+ jungleDvd.value.getTitle());

    }

    

    public static void swap(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static <T> void swap(Wrapper<T> w1, Wrapper<T> w2){
        T tmp = w1.value;
        w1.value = w2.value;
        w2.value = tmp;
    }

    // public static void changeTitle(DigitalVideoDisc dvd, String title){
    //     String oldtitle = dvd.getTitle();
    //     dvd.setTitle(title);
    //     dvd = new DigitalVideoDisc(oldtitle);
    // }
    
}
