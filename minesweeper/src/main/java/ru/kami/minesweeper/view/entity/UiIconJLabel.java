package ru.kami.minesweeper.view.entity;

import ru.kami.minesweeper.view.icon.MinesweeperImageIconRegistry;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

import static ru.kami.minesweeper.view.constant.UIConstants.ICON_HEIGHT;
import static ru.kami.minesweeper.view.constant.UIConstants.ICON_WIDTH;

public class UiIconJLabel extends JLabel {
    // класс который отображает нужную иконку ( название иконки передается параметром)
    public UiIconJLabel(String code) {
        setPreferredSize(new Dimension(ICON_WIDTH, ICON_HEIGHT));
        Optional<ImageIcon> imageIcon = MinesweeperImageIconRegistry.getUiImageIconMap(code);
        setIcon(imageIcon.get());
    }
}
