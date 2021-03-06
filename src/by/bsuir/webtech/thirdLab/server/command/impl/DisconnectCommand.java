package by.bsuir.webtech.thirdLab.server.command.impl;


import by.bsuir.webtech.thirdLab.server.command.Command;
import by.bsuir.webtech.thirdLab.server.command.exception.CommandException;
import by.bsuir.webtech.thirdLab.server.model.AuthType;
import by.bsuir.webtech.thirdLab.server.service.ServiceFactory;

public class DisconnectCommand implements Command {
    @Override
    public String execute(Object caller, String request) throws CommandException {
        ServiceFactory.getInstance().getAuthService().setAuthType(caller, AuthType.UNAUTH);
        return "Bye bye!";
    }
}
