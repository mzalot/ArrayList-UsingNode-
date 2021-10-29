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
            currentNode = currentNode.getNode1();
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
    public static void main(String[] args) {
    }
}
