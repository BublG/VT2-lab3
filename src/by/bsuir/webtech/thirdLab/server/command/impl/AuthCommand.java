package by.bsuir.webtech.thirdLab.server.command.impl;


import by.bsuir.webtech.thirdLab.server.command.Command;
import by.bsuir.webtech.thirdLab.server.command.exception.CommandException;
import by.bsuir.webtech.thirdLab.server.model.AuthType;
import by.bsuir.webtech.thirdLab.server.service.ServiceFactory;

public class AuthCommand implements Command {
    @Override
    public String execute(Object caller, String request) throws CommandException {
        var arguments = request.split(" ");
        if (arguments.length != 2) throw new CommandException("AUTH command should contain 1 argument");
        AuthType authType;
        try {
            authType = AuthType.valueOf(arguments[1]);
        } catch (IllegalArgumentException e) {
            throw new CommandException("No such auth type");
        }

        ServiceFactory.getInstance().getAuthService().setAuthType(caller, authType);
        return "Success.";
    }
}
