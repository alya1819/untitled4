public class Students {
    public Students(String ali, int i, int i1) {
    }

    public static void main(String[] args) {
        Students[]studens=new Students[3];
        studens[0]=new Students("ali",123,12);
        studens[1]=new Students("ahmed",124,11);
        studens[2]=new Students("alya",125,13);
        for (Students i: studens){
            System.out.println();
        }
    }
}
