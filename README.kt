fun main() {
    //val dwelling = Dwelling(6)
	val minhaCasa : SquareCabin = SquareCabin(6)

    with( minhaCasa ) {
    	println( "----- minhaCasa --------" )
    	println( "Capacidade: ${capacity} ")
    	println( "Material: ${buildingMaterial} ")
    	println( "Tem quarto: ${hasRoom()} ")
    }
}


abstract class Dwelling( private var residents : Int ) {
    abstract var buildingMaterial : String
    abstract var capacity : Int
    
    fun hasRoom() : Boolean {
        return residents < capacity
    }
}

class SquareCabin (residents : Int) : Dwelling(residents) {
    override var buildingMaterial = "Wood"
    override var capacity = 6
}
