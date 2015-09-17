/**
 * Copyright [2015] [plter] http://osdg.org
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.plter.balls;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Created by plter on 9/17/15.
 */
public class Ball extends Circle {


    private double speedX, speedY;
    private double x = 275, y = 200;

    public Ball() {
        setRadius(20);
        setFill(Color.valueOf("#cccccc"));
        setStroke(Color.valueOf("#000000"));

        speedX = Math.random() * 10 - 5;
        speedY = Math.random() * 10 - 5;
    }

    public void move() {
        x += speedX;
        y += speedY;
        setCenterX(x);
        setCenterY(y);
    }
}
