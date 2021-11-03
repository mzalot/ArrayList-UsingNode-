/**
 ArrayList
 The program will create an arraylist that uses
 Author: Mareks Zeile
 Collaborator(s):
 Collaboration:
 Date: 10/28/21
 **/
public class ArrayList <T>{
    //instance data
    NodeProject node = new NodeProject();
    //counter for index of node
    int counter = 0;

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
    public static void main(String[] args) {
    }
}
