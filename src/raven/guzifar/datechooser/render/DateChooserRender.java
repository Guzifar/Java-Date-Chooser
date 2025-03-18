package raven.guzifar.datechooser.render;

import raven.guzifar.custom.datechooser.DateBetween;
import raven.guzifar.custom.datechooser.DateChooser;

import java.util.Date;

public interface DateChooserRender {
    public String renderLabelCurrentDate(DateChooser dateChooser, Date date);

    public String renderTextFieldDate(DateChooser dateChooser, Date date);

    public String renderTextFieldDateBetween(DateChooser dateChooser, DateBetween dateBetween);
}
