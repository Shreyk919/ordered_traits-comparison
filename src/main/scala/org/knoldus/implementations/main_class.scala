package implementations

import traits.person

    /*
    main object for implementing the comparison operation between two persons
     */
    object main_class {

        /*
            main function
         */
         def main(args: Array[String]) {


             val person1 = new person("John", 42)      //input person1

             val person2 = new person("Marcus", 23)    //input person2

             val person3 = new person("David", 34)     //input person3

             val person4 = new person("David", 16)     //input person4

             /*
                checking all possible comparison options between 4 inputs
              */
             println(person1 >= person2)

             println(person2 >= person1)

             println(person3 < person4)

             println(person4 < person3)

        }
    }
