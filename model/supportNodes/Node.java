package model.supportNodes;

import model.utils.ImageLoader;

import java.util.LinkedList;

public class Node {
    private LinkedList<Node> parents = new LinkedList<>();
    private int value;
    private Node child;
    private Position position;
    public boolean placed = false;

    public Node(int value){
        this.value = value;
    }

    public void setChild(Node child) {
        this.child = child;
        child.parents.add(this);
    }

    public static void generatePositions(Node[] list) {
        int width = ImageLoader.getWidth();
        int x = 0;
        int y = 0;

        for(Node n : list) {
            if(x == width) {
                x = 0;
                y++;
            }

            n.position = new Position(x, y);

            x++;
        }
    }

    public Node getChild() {
        return child;
    }
    public LinkedList<Node> getParents() {
        return parents;
    }
    public int getValue() {
        return value;
    }
    public Position getPosition() { return position; }
}