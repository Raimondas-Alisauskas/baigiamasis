
public class Person {

    private Integer age;
    private Integer weight;
    private Object name = null;
    private Object country = null;

    Person(Build obj) {
        if (obj.age < 1) {
            obj.age = 5000;
            System.out.println(String.format("Setted age to: 5000"));
        }
//        this.age = obj.age;
//        this.weight = obj.weight;
//        this.name = obj.name;
//        this.country = obj.country;
    }

    protected void getValues() {
        System.out.println(String.format("Object: age: %s, \nweight: %s, \nname: %s," +
                        " \ncountry: %s",
                this.age, this.weight, this.name, this.country));
    }

    public static class Build {
        private Integer age;
        private final Integer weight;
        private String name;
        private String country;

        public Build(Integer age, Integer weight) {
            if (age < 150 || age > 0) {
                this.age = age;
            } else {
                System.out.println(String.format("Bad age: %s", age));
                    this.age = 0;
            }
            if (weight < 600 || weight > 3) {
                this.weight = weight;
            } else {
                System.out.println(String.format("Bad weight: %s", weight));
                this.weight = 14;
            }
        }

        public Build setName (String name)
        {
            if (!name.matches("^[a-zA-Z]+$") || name.length() > 25 || name.length() < 2) {
                System.out.println(String.format("Name too bad/long/short: %s", name));
                return this;
            }
            System.out.println(String.format("Setting name: %s", name));
            this.name = name; return this;}

        public Build setCountry (String country)
        {
                if (!country.matches("^[a-zA-Z]+$") || country.length() > 20 || country.length() < 2) {
                System.out.println(String.format("Bad country: %s", country));
                return this;
                }
            System.out.println(String.format("Setting country: %s", country));
            this.country = country; return this;}

        public Person build() {

            Person p = new Person(this);
            p.age = this.age;
            p.country = this.country;
            p.weight = this.weight;
            p.name = this.name;
            return p;
        }
    }
}