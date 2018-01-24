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
package net;

public enum RecvOpcode {
    CUSTOM_PACKET(0x3713),//13 37 lol
    
    LOGIN_PASSWORD(0x1),
    GUEST_LOGIN(0x2),
    SERVERLIST_REREQUEST(0x4),
    CHARLIST_REQUEST(0x5),
    SERVERSTATUS_REQUEST(0x6),
    ACCEPT_TOS(0x7),
    SET_GENDER(0x8),
    AFTER_LOGIN(0x9),
    REGISTER_PIN(0xA),
    SERVERLIST_REQUEST(0xB),
    PLAYER_DC(0xC),
    VIEW_ALL_CHAR(0xD),
    PICK_ALL_CHAR(0xE),
    CHAR_SELECT(0x13),
    PLAYER_LOGGEDIN(0x14),
    CHECK_CHAR_NAME(0x15),
    CREATE_CHAR(0x16),
    DELETE_CHAR(0x18),
    PONG(0x19),
    CLIENT_START_ERROR(0x1A),
    CLIENT_ERROR(0x1B),
    RELOG(0x1C), //Right??
    STRANGE_DATA(0x1D), //Right??
    REGISTER_PIC(0x1E),
    CHAR_SELECT_WITH_PIC(0x1F),
    VIEW_ALL_PIC_REGISTER(0x20),
    VIEW_ALL_WITH_PIC(0x21),
    CHANGE_MAP(0x2B),
    CHANGE_CHANNEL(0x2C),
    ENTER_CASHSHOP(0x2D),
    MOVE_PLAYER(0x2E),
    CANCEL_CHAIR(0x2F),
    USE_CHAIR(0x30),
    CLOSE_RANGE_ATTACK(0x31),
    RANGED_ATTACK(0x32),
    MAGIC_ATTACK(0x33),
    TOUCH_MONSTER_ATTACK(0x34),
    TAKE_DAMAGE(0x35),
    GENERAL_CHAT(0x37),
    CLOSE_CHALKBOARD(0x38),
    FACE_EXPRESSION(0x39),
    USE_ITEMEFFECT(0x3A),
    USE_DEATHITEM(0x3B),
    MONSTER_BOOK_COVER(0x3F),
    NPC_TALK(0x40),
    REMOTE_STORE(0x41),
    NPC_TALK_MORE(0x42),
    NPC_SHOP(0x43),
    STORAGE(0x44),
    HIRED_MERCHANT_REQUEST(0x45),
    FREDRICK_ACTION(0x46),
    DUEY_ACTION(0x47),
    OWL_ACTION(0x49),   //sends most searched info to client
    OWL_WARP(0x4A),     //handles player warp to store
    ADMIN_SHOP(0x4B),
    ITEM_SORT(0x4C),
    ITEM_SORT2(0x4D),
    ITEM_MOVE(0x4E),
    USE_ITEM(0x4F),
    CANCEL_ITEM_EFFECT(0x50),
    STATE_CHANGE_BY_PORTABLE_CHAIR_REQUEST(0x51),
    USE_SUMMON_BAG(0x52),
    PET_FOOD(0x53),
    USE_MOUNT_FOOD(0x54),
    SCRIPTED_ITEM(0x55),
    USE_CASH_ITEM(0x56),
    //USE_OWL_ITEM(0x57), ... no idea
    USE_CATCH_ITEM(0x58),
    USE_SKILL_BOOK(0x59),
    USE_TELEPORT_ROCK(0x5B),
    USE_RETURN_SCROLL(0x5C),
    USE_UPGRADE_SCROLL(0x5D),
    
    HyperUpgradeItemUse(0x5E), //New!!
    ItemOptionUpgradeItemUse(0x5F), //New!!
    ItemReleaseRequest(0x60), //New!!
    
    DISTRIBUTE_AP(0x61),
    AUTO_DISTRIBUTE_AP(0x62),
    HEAL_OVER_TIME(0x63),
    DISTRIBUTE_SP(0x65),
    SPECIAL_MOVE(0x66),
    CANCEL_BUFF(0x67),
    SKILL_EFFECT(0x68),
    MESO_DROP(0x69),
    GIVE_FAME(0x6A),
    CHAR_INFO_REQUEST(0x6C),
    SPAWN_PET(0x6D),
    CANCEL_DEBUFF(0x6E),
    CHANGE_MAP_SPECIAL(0x6F),
    USE_INNER_PORTAL(0x70),
    TROCK_ADD_MAP(0x71),
    REPORT(0x74),
    QUEST_ACTION(0x76),
    USER_CALC_DAMAGE_STAT_SET_REQUEST(0x77),
    THROW_GRENADE(0x78),
    SKILL_MACRO(0x79),
    SPOUSE_CHAT(0x8B),
    USE_ITEM_REWARD(0x7B),
    MAKER_SKILL(0x7C),
    USE_REMOTE(0x7F),
    WATER_OF_LIFE(0x80),
    
    UserFollowCharacterRequest(0x85), //New!!
    UserFollowCharacterWithdraw(0x86), //New!!
    SetPassenserResult(0x87), //New!!
    
    ADMIN_CHAT(0x88),
    PARTYCHAT(0x89),
    WHISPER(0x8A),
    MESSENGER(0x8C),
    PLAYER_INTERACTION(0x8D),
    PARTY_OPERATION(0x8E),
    DENY_PARTY_REQUEST(0x8F),
    GUILD_OPERATION(0x92),
    DENY_GUILD_REQUEST(0x93),
    ADMIN_COMMAND(0x94),
    ADMIN_LOG(0x95),
    BUDDYLIST_MODIFY(0x96),
    NOTE_ACTION(0x97),
    USE_DOOR(0x99),
    CHANGE_KEYMAP(0x9C),
    RPS_ACTION(0x9D),
    RING_ACTION(0x9E),
    WEDDING_ACTION(0xA1),
    ITEM_VAC_ALERT(0xA2),
    ALLIANCE_REQUEST(0xA4),
    ALLIANCE_OPERATION(0xA5),
    
    //FamilyChartRequest(0xA6),
    //FamilyInfoRequest(0xA7),
    //FamilyRegisterJunior(0xA8),
    //FamilyUnregisterJunior(0xA9),
    //FamilyUnregisterParent(0xAA),
    //FamilyJoinResult(0xAB),
    //FamilyUsePrivilege(0xAC),
    //FamilySetPrecept(0xAD),
    //FamilySummonResult(0xAE),
    OPEN_FAMILY(0xA6),
    ADD_FAMILY(0xA8),
    ACCEPT_FAMILY(0xAB),
    USE_FAMILY(0xAC),
    
    BBS_OPERATION(0xB0),
    ENTER_MTS(0xB1),
    USE_SOLOMON_ITEM(0xB2),
    USE_GACHA_EXP(0xB3),
    NEW_YEAR_CARD_REQUEST(0xB4), //Right??
    CASH_ITEM_GACHAPON_REQUEST(0xB6),
    CLICK_GUIDE(0xB9),
    ARAN_COMBO_COUNTER(0xBA),
    MOB_CRC_KEY_CHANGED_REPLY(0xBB),
    ACCOUNT_MORE_INFO(0xBE),
    FIND_FRIEND(0xBF),
    MOVE_PET(0xC4),
    PET_CHAT(0xC5),
    PET_COMMAND(0xC6),
    PET_LOOT(0xC7),
    PET_AUTO_POT(0xC8),
    PET_EXCLUDE_ITEMS(0xC9),
    MOVE_SUMMON(0xCC),
    SUMMON_ATTACK(0xCD),
    DAMAGE_SUMMON(0xCE),
    BEHOLDER(0xCF),
    MOVE_DRAGON(0xD3),
    QUICKSLOT_CHANGE(0xD5),
    MOVE_LIFE(0xDC),
    AUTO_AGGRO(0xDD),
    MOB_DAMAGE_MOB_FRIENDLY(0xE0),
    MONSTER_BOMB(0xE1),
    MOB_DAMAGE_MOB(0xE2),
    MOB_SKILL_DELAY_END(0xE3),
    NPC_ACTION(0xEA),
    ITEM_PICKUP(0xEF),
    DAMAGE_REACTOR(0xF2),
    TOUCHING_REACTOR(0xF3),
    REQUIRE_FIELD_OBSTACLE_STATUS(0xF4),
    TEMP_SKILL(0xFFFFFFFE),
    MAPLETV(0xFFFE),//Don't know
    SNOWBALL(0xF8),
    LEFT_KNOCKBACK(0xF9),
    COCONUT(0xFA),
    MATCH_TABLE(0xFB),//Would be cool if I ever get it to work :)
    MONSTER_CARNIVAL(0xFF),
    PARTY_SEARCH_REGISTER(0x102),
    PARTY_SEARCH_START(0x103),
    PLAYER_UPDATE(0x104), //PARTY_SEARCH_STOP?
    CHECK_CASH(0x10B),
    CASHSHOP_OPERATION(0x10C),
    COUPON_CODE(0x10D),
    
    OPEN_ITEMUI(0xEEE), //Unknown..
    CLOSE_ITEMUI(0xEEE), //Unknown..
    USE_ITEMUI(0xEEE), //Unknown..
    
    MTS_OPERATION(0xEEE), //Unknown..
    USE_MAPLELIFE(0xEEE), //Unknown..
    
    USE_HAMMER(0xEEE); //Unknown..
    private int code = -2;

    private RecvOpcode(int code) {
        this.code = code;
    }

    public int getValue() {
        return code;
    }
}
