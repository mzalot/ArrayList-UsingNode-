/**
 ArrayList
 The program will create an arraylist that uses
 Author: Ishan
 Collaborator(s):
 Collaboration:
 Date: 10/28/21
 **/
public class ArrayList <T>{
    //instance data
    private NodeProject node;
    //counter for index of node
    private int counter;

    public ArrayList(){
        this.counter = 0;
        this.node = new NodeProject();
    }

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
    }


