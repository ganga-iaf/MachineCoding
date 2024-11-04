package Controllers;

import Dtos.IssueTicketRequestDto;
import Dtos.IssueTicketResponseDto;
import Dtos.ResponseStatus;
import Models.Ticket;
import Models.Vehicle;
import Services.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService){
        this.ticketService=ticketService;
    }
    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto request){
        IssueTicketResponseDto response=new IssueTicketResponseDto();
        try{
            Ticket ticket=this.ticketService.issueTicket(request.getVehicleNumber(),
                    request.getOwnerName(),request.getVehicleType(), request.getGateId());
            response.setTicket(ticket);
            response.setResponseStatus(ResponseStatus.Success);
            response.setMessage("Ticket generate successfully");
        }catch(Exception ex){
            response.setResponseStatus(ResponseStatus.Failure);
            response.setMessage(ex.getMessage());
        }
        return response;
    }
}
