

fun main() {

    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    // updated coins() to use lambda shorthand syntax
    val coins: (Int) -> String = { 
        "Have $it qaurters"
    }


    val trickFunction1 = trickOrExtraTreat(false, {"Have $it chocolates"})
    val trickFunction = trickOrExtraTreat(false, coins)
    
    val treatFunction = trickOrExtraTreat(true, cupcake)
    val treatFunction1 = trickOrTreatOrNull(true, null)

     // Use trailing lambda syntax
     val treatFunctionWithTrailingLambda = trickOrExtraTreat(false) {"Have $it kisses!"}

    trickFunction()
    trickFunction1()
    // treatFunctionWithTrailingLambda()
     // repeat() a high-order function
     repeat(4) {
        treatFunctionWithTrailingLambda()
    }
    println()

    treatFunction()
    treatFunction1()
    println()
    println()
    
    

   
    trick()
    treat()
}

val trick = { // lambda expression
    println("No treats!")
}

// User function as a datatype
val treat: () -> Unit = {
    println("Have a treat!")
}


// Use function as a return type

fun trickOrTreat(isTrick: Boolean): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        return treat
    }
}


// Pass a function to another function as an argument
fun trickOrExtraTreat(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        println(extraTreat(5))
        return treat
    }
}

// Nullable function types
fun trickOrTreatOrNull(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}