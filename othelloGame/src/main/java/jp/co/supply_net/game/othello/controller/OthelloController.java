package jp.co.supply_net.game.othello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.supply_net.game.othello.dto.InitGameDto;

@Controller
@RequestMapping(path = "/othello")
public class OthelloController {
    private static final Logger log = LoggerFactory.getLogger(OthelloController.class);

    @RequestMapping(path = {"", "/index"}, method = RequestMethod.GET)
    public String firstView(Model model) {
        // ゲーム開始画面表示
        return "";
    }
    @RequestMapping(path = "/init", method = RequestMethod.POST)
    public String initGame(Model model, @ModelAttribute InitGameDto initGameDto) {
        // InitGameDtoからパス回数とプレーヤの石の色を取得しゲーム管理へ渡す
        // ゲーム管理にてゲーム盤のインスタンス生成
        // ゲーム画面表示
        return "";
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public String resultView(Model model) {
        // ゲーム管理から石の数取得し勝敗判定
        // ゲーム結果画面表示
        return "";
    }
}