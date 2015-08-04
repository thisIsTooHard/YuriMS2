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

public enum SendOpcode_1 {

    LOGIN_STATUS(0x00),
    GUEST_ID_LOGIN(0x01),
    ACCOUNT_INFO(0x02),//I guess this was in v83 too :)
    SERVERSTATUS(0x03),//CHECK_USER_LIMIT_RESULT
    GENDER_DONE(0x04),//SET_ACCOUNT_RESULT
    CONFIRM_EULA_RESULT(0x05),
    CHECK_PINCODE(0x06),
    UPDATE_PINCODE(0x07),
    
    VIEW_ALL_CHAR(0x08),
    SELECT_CHARACTER_BY_VAC(0x09),
    
    SERVERLIST(0x0A),
    CHARLIST(0x0B),
    SERVER_IP(0x0C),
    CHAR_NAME_RESPONSE(0x0D),
    ADD_NEW_CHAR_ENTRY(0x0E),
    DELETE_CHAR_RESPONSE(0x0F),
    CHANGE_CHANNEL(0x10),
    PING(0x11),
    KOREAN_INTERNET_CAFE_SHIT(0x12),//Useless ignore it.
    CHANNEL_SELECTED(0x14),
    HACKSHIELD_REQUEST(0x15),//maybe this is RELOG_RESPONSE, can't care less
    RELOG_RESPONSE(0x16),
    CHECK_CRC_RESULT(0x19),
    LAST_CONNECTED_WORLD(0x1A),
    RECOMMENDED_WORLD_MESSAGE(0x1B),
    CHECK_SPW_RESULT(0x1D),
    
    /*CWvsContext::OnPacket*/
    INVENTORY_OPERATION(0x1E),
    INVENTORY_GROW(0x1F),
    STAT_CHANGED(0x20),
    GIVE_BUFF(0x21),
    CANCEL_BUFF(0x22),
    FORCED_STAT_SET(0x23),
    FORCED_STAT_RESET(0x24),
    UPDATE_SKILLS(0x25),
    SKILL_USE_RESULT(0x26),
    FAME_RESPONSE(0x27),
    SHOW_STATUS_INFO(0x28),
    OPEN_FULL_CLIENT_DOWNLOAD_LINK(0x29),
    MEMO_RESULT(0x2A),
    MAP_TRANSFER_RESULT(0x2B),
    ANTI_MACRO_RESULT(0x2C),
    CLAIM_RESULT(0x2E),
    CLAIM_AVAILABLE_TIME(0x2F),
    CLAIM_STATUS_CHANGED(0x30),
    SET_TAMING_MOB_INFO(0x31),
    QUEST_CLEAR(0x32),
    ENTRUSTED_SHOP_CHECK_RESULT(0x33),
    SKILL_LEARN_ITEM_RESULT(0x34),
    GATHER_ITEM_RESULT(0x35),
    SORT_ITEM_RESULT(0x36),
    SUE_CHARACTER_RESULT(0x38),
    TRADE_MONEY_LIMIT(0x3A),
    SET_GENDER(0x3B),
    GUILD_BBS_PACKET(0x3C),
    CHAR_INFO(0x3E),
    PARTY_OPERATION(0x3F),
    BUDDYLIST(0x42),
    GUILD_OPERATION(0x44),
    ALLIANCE_OPERATION(0x45),
    SPAWN_PORTAL(0x46),
    SERVERMESSAGE(0x48),
    INCUBATOR_RESULT(0x49),
    SHOP_SCANNER_RESULT(0x4A),
    SHOP_LINK_RESULT(0x4B),
    
    MARRIAGE_REQUEST(0x4C),
    MARRIAGE_RESULT(0x4D),
    WEDDING_GIFT_RESULT(0x4E),
    NOTIFY_MARRIED_PARTNER_MAP_TRANSFER(0x4F),
    
    CASH_PET_FOOD_RESULT(0x50),
    SET_WEEK_EVENT_MESSAGE(0x51),
    SET_POTION_DISCOUNT_RATE(0x52),
    
    BRIDLE_MOB_CATCH_FAIL(0x53),
    IMITATED_NPC_RESULT(0x54),
    IMITATED_NPC_DATA(0x55),
    LIMITED_NPC_DISABLE_INFO(0x56),
    MONSTER_BOOK_SET_CARD(0x57),
    MONSTER_BOOK_SET_COVER(0x58),
    HOUR_CHANGED(0x59),
    MINIMAP_ON_OFF(0x5A),
    CONSULT_AUTHKEY_UPDATE(0x5B),
    CLASS_COMPETITION_AUTHKEY_UPDATE(0x5C),
    WEB_BOARD_AUTHKEY_UPDATE(0x5D),
    SESSION_VALUE(0x5E),
    PARTY_VALUE(0x5F),
    FIELD_SET_VARIABLE(0x60),
    BONUS_EXP_CHANGED(0x61),//pendant of spirit etc (guess, not sure about the opcode in v83)
    
    FAMILY_CHART_RESULT(0x63),
    FAMILY_INFO_RESULT(0x64),
    FAMILY_RESULT(0x65),
    FAMILY_JOIN_REQUEST(0x66),
    FAMILY_JOIN_REQUEST_RESULT(0x67),
    FAMILY_JOIN_ACCEPTED(0x68),
    FAMILY_PRIVILEGE_LIST(0x69),
    FAMILY_FAMOUS_POINT_INC_RESULT(0x6A),
    FAMILY_NOTIFY_LOGIN_OR_LOGOUT(0x6B), //? is logged in. LOLWUT
    FAMILY_SET_PRIVILEGE(0x6C),
    FAMILY_SUMMON_REQUEST(0x6D),
    
    NOTIFY_LEVELUP(0x6E),
    NOTIFY_MARRIAGE(0x6F),
    NOTIFY_JOB_CHANGE(0x70),
    //SET_BUY_EQUIP_EXT(0x6C),//lol?
    MAPLE_TV_USE_RES(0x72), //It's not blank, It's a popup nibs
    AVATAR_MEGAPHONE_RESULT(0x73),//bot useless..
    SET_AVATAR_MEGAPHONE(0x74),
    CLEAR_AVATAR_MEGAPHONE(0x75),
    CANCEL_NAME_CHANGE_RESULT(0x76),
    CANCEL_TRANSFER_WORLD_RESULT(0x77),
    DESTROY_SHOP_RESULT(0x78),
    FAKE_GM_NOTICE(0x79),//bad asses
    SUCCESS_IN_USE_GACHAPON_BOX(0x7A),
    NEW_YEAR_CARD_RES(0x7B),
    RANDOM_MORPH_RES(0x7C),
    CANCEL_NAME_CHANGE_BY_OTHER(0x7D),
    SET_BUY_EQUIP_EXT(0x7E),
    SCRIPT_PROGRESS_MESSAGE(0x80),
    DATA_CRC_CHECK_FAILED(0x80),
    MACRO_SYS_DATA_INIT(0x81),
    
    /*CStage::OnPacket*/
    SET_FIELD(0x8C),
    SET_ITC(0x8D),
    SET_CASH_SHOP(0x8E),
    
    /*CField::OnPacket*/
    SET_BACK_EFFECT(0x8F),
    SET_MAP_OBJECT_VISIBLE(0x90),//CMapLoadable::OnSetMapObjectVisible O_O
    CLEAR_BACK_EFFECT(0x91),
    BLOCKED_MAP(0x92),//TransferFieldRequestIgnored
    BLOCKED_SERVER(0x93),
    FORCED_MAP_EQUIP(0x94),//FIELD_SPECIFIC_DATA
    MULTICHAT(0x95),
    WHISPER(0x96),
    SPOUSE_CHAT(0x97),
    SUMMON_ITEM_INAVAILABLE(0x98), //You can't use it in this map
    
    FIELD_EFFECT(0x99),
    FIELD_OBSTACLE_ONOFF(0x9A),
    FIELD_OBSTACLE_ONOFF_STATUS(0x9B),
    FIELD_OBSTACLE_ALL_RESET(0x9C),
    BLOW_WEATHER(0x9D),
    PLAY_JUKEBOX(0x9E),

    ADMIN_RESULT(0x9F),
    OX_QUIZ(0xA0),//QUIZ
    GMEVENT_INSTRUCTIONS(0xA1),//DESC
    CLOCK(0xA2),
    CONTI_MOVE(0xA3),
    CONTI_STATE(0xA4),
    SET_QUEST_CLEAR(0xA5),
    SET_QUEST_TIME(0xA6),
    WARN_MESSAGE(0xA7),
    SET_OBJECT_STATE(0xA8),
    STOP_CLOCK(0xA9), //DestroyClock
    ARIANT_ARENA_SHOW_RESULT(0xAA),
    PYRAMID_GAUGE(0xAC), //???
    PYRAMID_SCORE(0xAB), //???
    SPAWN_PLAYER(0xB1),
    REMOVE_PLAYER_FROM_MAP(0xB2),
    CHATTEXT(0xB3), //0
    CHATTEXT1(0xB4), //1
    CHALKBOARD(0xB5), // OnADBoard
    UPDATE_CHAR_BOX(0xB6), // OnMiniRoomBalloon
    SHOW_CONSUME_EFFECT(0xB7), //SetConsumeItemEffect_0
    SHOW_SCROLL_EFFECT(0xB8), //ShowItemUpgradeEffect
    
    SPAWN_PET(0xC3),
    PET_MOVE(0xC6),
    PET_CHAT(0xC7),
    PET_NAMECHANGE(0xC8),
    PET_SHOW(0xC9),
    PET_COMMAND(0xCA),
    SUMMON_SPAWN(0xCB), //SummonPoolCreated
    SUMMON_REMOVE(0xCC), //SummonPoolRemoved
    SUMMON_MOVE(0xCD), //SummonPoolMove
    SUMMON_ATTACK(0xCE), //SummonPoolAttack
    SUMMON_SKILL(0xCF), //SummonPoolSkill
    SUMMON_DAMAGE(0xD0), //SummonPoolHit
    DRAGON_SPAWN(0xD1),
    DRAGON_MOVE(0xD2),
    DRAGON_REMOVE(0xD3),
    MOVE_PLAYER(0xD5), //Move
    CLOSE_RANGE_ATTACK(0xD6), //MeleeAttack
    RANGED_ATTACK(0xD7), //ShootAttack
    MAGIC_ATTACK(0xD8), //MagicAttack
    ENERGY_ATTACK(0xD9), //EnergyAttack
    SKILL_EFFECT(0xDA), //SkillPrepare
    CANCEL_SKILL_EFFECT(0xDB), //SkillCancel
    DAMAGE_PLAYER(0xDC), //Hit
    FACIAL_EXPRESSION(0xDB), //Emotion
    SHOW_ITEM_EFFECT(0xDE), //SetActiveEffectItem
    SHOW_CHAIR(0xE0), //SetActivePortableChair
    UPDATE_CHAR_LOOK(0xE1), //AvatarModified
    SHOW_FOREIGN_EFFECT(0xE2), //Effect
    GIVE_FOREIGN_BUFF(0xE3), //SetTemporaryStat
    CANCEL_FOREIGN_BUFF(0xE4), //ResetTemporaryStat
    UPDATE_PARTYMEMBER_HP(0xE5), //ReceiveHP
    CANCEL_CHAIR(0xE9), //SitResult
    SHOW_ITEM_GAIN_INCHAT(0xEB),  //UserEffect
    DOJO_WARP_UP(0xEC), //Teleport
    //LUCKSACK_PASS(0xED),
    //LUCKSACK_FAIL(0xD1),
    //MESO_BAG_MESSAGE(0xD0),
    MESOBAG_SUCCESS(0xEE), //MesoGive_Succeeded
    MESOBAG_FAILURE(0xEF), //MesoGive_Failed
    UPDATE_QUEST_INFO(0xF4), //QuestResult
    PLAYER_HINT(0xF7), //0xD6 BalloonMsg
    //KOREAN_EVENT(0xFC),
    OPEN_UI(0xFD), //OpenUI
    LOCK_UI(0xFE), //OpenUIWithOption
    CYGNUS_INTRO_LOCK(0xFF), //SetDirectionMode
    CYGNUS_INTRO_DISABLE_UI(0x100), //SetStandAloneMode
    SUMMON_HINT(0x101), //HireTutor
    SUMMON_HINT_MSG(0x102), //TutorMsg
    SHOW_COMBO(0x103), //IncComboResponse
    COOLDOWN(0x112), //SkillCooltimeSet
    SPAWN_MONSTER(0x114), //MobEnterField
    KILL_MONSTER(0x115), //MobLeaveField
    SPAWN_MONSTER_CONTROL(0x116), //MobChangeController
    MOVE_MONSTER(0x117), //MobMove
    MOVE_MONSTER_RESPONSE(0x118), //MobCtrlAck
    APPLY_MONSTER_STATUS(0x11A), //MobStatSet
    CANCEL_MONSTER_STATUS(0x11B), //MobStatReset
    //RESET_MONSTER_ANIMATION(0x11C),//LOL? o.o
    //Something with mob, but can't figure out00
    DAMAGE_MONSTER(0x11E), //MobAffected
    SHOW_MAGNET(0x11F), //SpecialEffectBySkill
    //ARIANT_THING(0xF9),
    SHOW_MONSTER_HP(0x122), //HPIndicator
    //SHOW_DRAGGED(0xFB),//CATCH
    CATCH_MONSTER(0x124), //EffectByItem
    SPAWN_NPC(0x12F), //NpcEnterField
    REMOVE_NPC(0x130), //NpcLeaveField
    SPAWN_NPC_REQUEST_CONTROLLER(0x131), //NpcChangeController
    NPC_ACTION(0x132), //NpcMove
    SPAWN_HIRED_MERCHANT(0x137), //EmployeeEnterField
    DESTROY_HIRED_MERCHANT(0x138), //EmployeeLeaveField
    UPDATE_HIRED_MERCHANT(0x139), //EmployeeMiniRoomBalloon
    DROP_ITEM_FROM_MAPOBJECT(0x13A), //DropEnterField
    REMOVE_ITEM_FROM_MAP(0x13C), //DropLeaveField
    //KITE_MESSAGE(0x10E),
    //KITE(0x10F),
    SPAWN_MIST(0x140), //AffectedAreaCreated
    REMOVE_MIST(0x141), //AffectedAreaRemoved
    SPAWN_DOOR(0x142), //TownPortalCreated
    REMOVE_DOOR(0x143), //TownPortalRemoved
    REACTOR_HIT(0x146), //ReactorChangeState
    REACTOR_SPAWN(0x148), //ReactorEnterField
    REACTOR_DESTROY(0x149), //ReactorLeaveField
    SNOWBALL_STATE(0x14A), //SnowBallState
    HIT_SNOWBALL(0x14B), //SnowBallHit
    SNOWBALL_MESSAGE(0x14C), //SnowBallMsg
    LEFT_KNOCK_BACK(0x14D), // OnSnowBallTouch
    COCONUT_HIT(0x14E), //CoconutHit
    COCONUT_SCORE(0x14F), //CoconutScore
    //GUILD_BOSS_HEALER_MOVE(0x11F),
    //GUILD_BOSS_PULLEY_STATE_CHANGE(0x120),
    MONSTER_CARNIVAL_START(0x152), //MonsterCarnivalEnter
    MONSTER_CARNIVAL_OBTAINED_CP(0x153), //MonsterCarnivalPersonalCP
    MONSTER_CARNIVAL_PARTY_CP(0x154), //MonsterCarnivalTeamCP
    MONSTER_CARNIVAL_SUMMON(0x155), //MonsterCarnivalRequestResult
    MONSTER_CARNIVAL_MESSAGE(0x156), //MonsterCarnivaRequestResult1
    MONSTER_CARNIVAL_DIED(0x157), //MonsterCarnivalProcessForDeath
    MONSTER_CARNIVAL_LEAVE(0x158), //MonsterCarnivalShowMemberOutMsg
    
    ARIANT_SCORE(0x15A), //AriantArenaUserScore
    SHEEP_RANCH_INFO(0x15C), //BattlefieldScoreUpdate
    SHEEP_RANCH_CLOTHES(0x15D), //BattlefieldTeamChanged
    //HORNTAIL_CAVE(0x12E),
    ZAKUM_SHRINE(0x162), //ZakumTimer
    NPC_TALK(0x163), //ScriptMessage
    OPEN_NPC_SHOP(0x164), //NpcShop
    CONFIRM_SHOP_TRANSACTION(0x165), //NpcShopBuy
    STORAGE(0x168), //TrunkDlg
    MERCH_ITEM_MSG(0x169), //MerchantItemMessage
    MERCH_ITEM_STORE(0x16A), //MerchantItemStore
    RPS_GAME(0x16B), //RPSGameDlg
    MESSENGER(0x16C), //UIMessenger
    PLAYER_INTERACTION(0x16D), //MiniRoomBaseDlg
    
    TOURNAMENT(0x116E), //Tournament
    TOURNAMENT_MATCH_TABLE(0x116F), //TournamentMatchTable
    TOURNAMENT_SET_PRIZE(0x170), //TournamentSetPrize
    TOURNAMENT_UEW(0x171), //TournamentUEW
    TOURNAMENT_CHARACTERS(0x172),//TournamentCharacter
    
    WEDDING_PROGRESS(0x173),//WeddingProgress
    WEDDING_CEREMONY_END(0x174), //WeddingCeremonyEnd
    
    PARCEL(0x175), //ParcelDlg
    
    CHARGE_PARAM_RESULT(0x176), //ChargeParamResult
    QUERY_CASH_RESULT(0x177), //QueryCashResult
    CASHSHOP_OPERATION(0x178), //CashItemResult 145
    
    KEYMAP(0x185), //FuncKeyMappedManInit
    AUTO_HP_POT(0x186), //PetConsumeItemInit
    AUTO_MP_POT(0x187), //PetConsumeMPItemInit 151
    SEND_TV(0x155),
    REMOVE_TV(0x156),
    ENABLE_TV(0x157),
    MTS_OPERATION2(0x15B),
    MTS_OPERATION(0x15C),
    VICIOUS_HAMMER(0x162);
    private int code = -2;

    private SendOpcode_1(int code) {
        this.code = code;
    }

    public int getValue() {
        return code;
    }
}
