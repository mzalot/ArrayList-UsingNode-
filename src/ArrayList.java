/**
ArrayList
 The program will create an arraylist that uses
 Author: Ishan, Connor, Mareks
 Collaborator(s):
 Collaboration:
 Date: 10/28/21
 **/
    public class ArrayList <T>{
        //instance data
        private NodeProject node;
        //counter for index of node
        private int counter;

        //empty constructor
        public ArrayList(){
            this.counter = 0;
            this.node = new NodeProject();
        }

        //boolean add method
        //returns false if an error happens to be in the list
        public boolean add(T data){
            try {
                //Determine added node in chain
                NodeProject currentNode = node;
                for (int i = 0; i < counter; i++) {
                    currentNode = currentNode.getNode2();
                }
                //new node with the data
                NodeProject newData = new NodeProject(data);
                newData.setNode1(currentNode);
                counter++;
            }
            catch(Exception a) {
                //if exception occurred
                a.printStackTrace();
                return false;
            }
            //If no exceptions
            return true;
        }

        //void add method
        public void add(int index, T data){
            //node to find current node
            NodeProject currentNode = node;
            for(int i = 0; i< index; i++){
                currentNode = currentNode.getNode2();
            }
            //add the new node with the data
            NodeProject nodeAdd = new NodeProject(data);
            //node we are replacing and moving
            NodeProject moveNode = currentNode.getNode1();
            nodeAdd.setNode1(currentNode);
            nodeAdd.setNode2(currentNode);
            //increase counter
            counter++;


        }

        //int size method
        public int size(){
            return counter;
        }

        //doing conor's work smh

        //remove method fix
        public T remove(int i){
            //node to find current node
            NodeProject currentNode = node;
            //go through indices
            for(int index = 0; i< index; i++){
                currentNode = currentNode.getNode2();
            }
            //move node above
            NodeProject replaceNode = currentNode.getNode1();
            replaceNode.setNode2(currentNode.getNode2());
            //reduce size
            counter--;
            //return
            return (T) currentNode.getValue();
        }

        //get method fix
        public T get(int i){
            //node to find current node
            NodeProject currentNode = node;
            //go through indices
            for(int index = 0; i< index; i++){
                currentNode = currentNode.getNode2();
            }
            return (T) currentNode.getValue();
        }

        //set method
        public T set(int i, T data){
            //node to find current node
            NodeProject currentNode = node;
            //go through indices
            for(int index = 0; i< index; i++){
                currentNode = currentNode.getNode2();
            }
            //store removed data to return
            T removedData = (T) currentNode.getValue();
            currentNode.setValue(data);
            return removedData;

        }

        //tester
    //tests if it works
     public boolean tester(){
            ArrayList test = new ArrayList();
         test.add(0,5);
         test.size();
         test.remove(5);
         test.set(0,5);
            if(test.equals(test.add(5))){
                return true;
            }

            if(test.get(5).equals(0)){
                return true;
            }
            else{
                return false;
            }

     }
     //public static void main to test
     public static void main(String[]args)
     {
         ArrayList a = new ArrayList();
         System.out.println(a.tester());
     }
}