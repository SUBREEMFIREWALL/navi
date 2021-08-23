package navi.commandsystem.commands.audioplayer;

import navi.Navi;
import navi.commandsystem.Command;
import navi.commandsystem.CommandParameters;

public class PauseCommand implements Command {
    @Override
    public String getDescription() {
        return "Pauses the player.";
    }

    @Override
    public boolean isAdminCommand() {
        return false;
    }

    @Override
    public void execute(CommandParameters params) {
        Navi.audioPlayer.pauseTrack(params.getGuild(), params.getTextChannel());
    }
}