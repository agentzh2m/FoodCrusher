package me.hamuel.newcrusher.model;

public class CellPair {
    private Cell from;
    private Cell to;

    public CellPair(Cell from, Cell to) {
        this.from = from;
        this.to = to;
    }

    public Cell getFrom() {
        return from;
    }

    public Cell getTo() {
        return to;
    }

    public void setFrom(Cell from) {
        this.from = from;
    }

    public void setTo(Cell to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "CellPair{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
