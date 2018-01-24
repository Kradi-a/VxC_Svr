/*
	This file is part of the OdinMS Maple Story Server
    Copyright (C) 2008 Patrick Huy <patrick.huy@frz.cc>
		       Matthias Butz <matze@odinms.de>
		       Jan Christian Meyer <vimes@odinms.de>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation version 3 as published by
    the Free Software Foundation. You may not use, modify or distribute
    this program under any other version of the GNU Affero General Public
    License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package client;

import java.util.ArrayList;
import java.util.List;
import server.MapleStatEffect;
import server.life.Element;

public class Skill {

    private int id;
    private List<MapleStatEffect> effects = new ArrayList<>();
    private Element element;
    private int animationTime;
    private int job;
    private boolean action;

    public Skill(int id) {
        this.id = id;
        this.job = id / 10000;
    }

    public int getId() {
        return id;
    }

    public MapleStatEffect getEffect(int level) {
        return effects.get(level - 1);
    }

    public int getMaxLevel() {
        return effects.size();
    }

    public boolean isFourthJob() {
        int j = id / 10000;
        int l = getJobLevel(j);
        if (j / 100 == 22 || j == 2001) { //Evan
            if (l != 9 && l != 10 && id != 22111001 && id != 22141002) {
                if (id != 22140000) {
                    return false;
                }
            }
            return true;
        }
        if (j / 10 == 43) { //Dualblade
            if (l != 4 && id != 4311003 && id != 4321000 && id != 4331002) {
                if (id != 4331005) {
                    return false;
                }
            }
            return true;
        }
        return j % 100 != 0 && j % 10 == 2;
    }

    public static int getJobLevel(int job) {
        int l;
        if (job % 100 != 0 && job != 2001) {
            if (job / 10 == 43) {
                l = (job - 430) / 2;
            } else {
                l = job % 10;
            }
            l += 2;
            if (l < 2 || (l > 4 && (l > 10 || (job / 100 != 22 && job != 2001)))) {
                l = 0;
            }
        } else if (job % 1000 == 0 || job == 2001) { //Novice
            l = 0;
        } else {
            l = 1;
        }
        return l;
    }

    public void setElement(Element elem) {
        element = elem;
    }

    public Element getElement() {
        return element;
    }

    public int getAnimationTime() {
        return animationTime;
    }

    public void setAnimationTime(int time) {
        animationTime = time;
    }

    public void incAnimationTime(int time) {
        animationTime += time;
    }

    public boolean isBeginnerSkill() {
        return id % 10000000 < 10000;
    }

    public void setAction(boolean act) {
        action = act;
    }

    public boolean getAction() {
        return action;
    }

    public void addLevelEffect(MapleStatEffect effect) {
        effects.add(effect);
    }
}
