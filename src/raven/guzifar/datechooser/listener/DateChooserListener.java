package raven.guzifar.datechooser.listener;

import raven.guzifar.custom.datechooser.DateBetween;

import java.util.Date;

public interface DateChooserListener {
    public void dateChanged(Date date, DateChooserAction action);

    public void dateBetweenChanged(DateBetween date, DateChooserAction action);
}
