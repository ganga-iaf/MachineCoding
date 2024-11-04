package Models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private long number;
    private Ticket ticket;
    private Date exitDateTime;
    private double amount;
    private Gate exitGate;

    private Operator operator;
    private List<Payment> paymentList;

    public Bill(long number, Ticket ticket, Date exitDateTime, Gate exitGate) {
        this.number = number;
        this.ticket = ticket;
        this.exitDateTime = exitDateTime;
        this.amount = 0;
        this.exitGate = exitGate;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Date getExitDateTime() {
        return exitDateTime;
    }

    public void setExitDateTime(Date exitDateTime) {
        this.exitDateTime = exitDateTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }
}
