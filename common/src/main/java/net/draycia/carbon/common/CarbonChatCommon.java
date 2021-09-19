package net.draycia.carbon.common;

import com.google.inject.Injector;
import net.draycia.carbon.api.CarbonChat;
import net.draycia.carbon.common.command.commands.WhisperCommand;
import net.draycia.carbon.common.listeners.DeafenHandler;
import net.draycia.carbon.common.listeners.MuteHandler;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.framework.qual.DefaultQualifier;

@DefaultQualifier(NonNull.class)
public abstract class CarbonChatCommon implements CarbonChat {

    public final void initialize(final Injector injector) {
        // lol, bukkit module can't extend Common and it can't call this
    }

}
