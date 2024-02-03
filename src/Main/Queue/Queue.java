package Main.Queue;

public class Queue {
    private No  refNoEntrando;


    public Queue(){
        this.refNoEntrando = null;
    }

    public void enqueue(No newNo){
        newNo.setRefNo(refNoEntrando);
        refNoEntrando = newNo;
    }

    public No first(){
        if(!this.isEmpty()) {
            No firstNo = refNoEntrando;
            while (true){
                if(firstNo.getRefNo()!=null){
                    firstNo = firstNo.getRefNo();
                }else{
                    break;
                }
            }


        }
        return null;
    }

    public No dequeue(){
        if(!this.isEmpty()) {
            No firstNo = refNoEntrando;
            No noAuxiliar = refNoEntrando;
            while (true){
                if(firstNo.getRefNo()!=null){
                    noAuxiliar =  firstNo;
                    firstNo = firstNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
                return firstNo;
            }
        }
        return null;
    }
    public boolean isEmpty(){
        return refNoEntrando == null? true : false;
    }

    @Override
    public String toString() {
     String stringReturn = "";

     No noAuxiliar = refNoEntrando;
     if (refNoEntrando!=null){
        while (true){
            stringReturn += " [No{retorno"+ noAuxiliar.getObject()+"}] ---> ";
            if (noAuxiliar.getRefNo()!=null){
                    noAuxiliar = noAuxiliar.getRefNo();
            }else{
                stringReturn +=  "null";
                break;
            }
        }
     }else{
        stringReturn =  "null";
     }
     return stringReturn;
    }
}
