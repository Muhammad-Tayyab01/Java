class BiCycle{
    String defineme(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }
    
    public void Motorcycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp=defineme(); 

        System.out.println("My ancestor is a cycle who is "+ temp );
    }
    
}

