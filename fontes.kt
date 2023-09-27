fun main() {
    //val dwelling = Dwelling(6)
	val minhaCasa = SquareCabin(6)

    with( minhaCasa ) {
    	println( "----- minhaCasa --------" )
    	println( "Capacidade: ${capacity} ")
    	println( "Material: ${buildingMaterial} ")
    	println( "Tem quarto: ${hasRoom()} ")
    }
    
    val minhaCabana = RoundHut( 3 )
    
    with( minhaCabana ) {
    	println( "----- minhaCabana --------" )
    	println( "Capacidade: ${capacity} ")
    	println( "Material: ${buildingMaterial} ")
    	println( "Tem quarto: ${hasRoom()} ")
    }
    
    val minhaTorre = RoundTower( 4 )
    
    with( minhaTorre ) {
    	println( "----- minhaTorre --------" )
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

open class RoundHut ( residents : Int ) : Dwelling(residents) { 
    override var buildingMaterial = "Straw"
    override var capacity = 4    
}

class RoundTower( residents : Int ) : RoundHut (residents) {
    override var buildingMaterial = "Stone"
    override var capacity = 4     
}
