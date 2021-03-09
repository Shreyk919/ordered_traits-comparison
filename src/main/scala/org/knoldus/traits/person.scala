package traits

  /*
    Define a class named Person and mix it with Ordered Trait to do the comparison
    */
  class person(val name: String, val age: Int) extends Ordered[person] {

    /*
      Function to compare two persons based on their age if
      ** names are same, then compare age
      ** names are not same, then compare the name length
     */
    def compare(that: person): Int =

    /*
      if names are same
     */
      if (this.name == that.name) {

      if(this.age < that.age) { -1        //comparing age
      }
      else { 1
      }
    }

    /*
    if name aren't similar
     */
    else {
      if (this.name.length < that.name.length) {
        -1
      }
      else {
        1
      }
    }

  }
