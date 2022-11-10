public class Person {
        private int age;

        public Person(){

            age = (int)Math.floor(Math.random()*(80-5+1)+5);


            System.out.println("Random age: " + age);
        }
        public void getLifeStage(){
            if(age <= 12){

                System.out.println("The person is a child");

            }else if(age >= 13 && age <= 19){

                System.out.println("The person is a teen");

            }else if(age >= 20 && age <= 59){

                System.out.println("The person is an adult");

            }else{
                System.out.println("The person is a senior adult");
            }
        }
}
