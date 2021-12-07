package by.bsuir.webtech.thirdLab.server.command;

import by.bsuir.webtech.thirdLab.server.command.exception.CommandException;

public interface Command {
    String execute(Object caller, String request) throws CommandException;
}
