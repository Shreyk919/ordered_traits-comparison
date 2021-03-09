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

             val person2 = new person("Marcus", 23)            //input person2

             /*
                checking all possible comparison options between person1 and person2
              */
             println(person1 < person2)

             println(person2 > person1)

             println(person1 >= person2)

             println(person2 >= person1)

        }
    }
