package Reflection;
public class Person {
        private String name;
        private String address;
        public Person(String name,String address)
        {
            this.name=name;
            this.address=address;
        }
        public void setName(String name) {
            this.name=name;
        }
        public void setAge(String address) {
            this.address=address;
        }
        public String getName() {
            return name;
        }
        public String getAddress() {
            return address;
        }
        private void getDisplay()
        {
            System.out.println("Name:"+name);
            System.out.println("Address:"+address);
        }
    }
