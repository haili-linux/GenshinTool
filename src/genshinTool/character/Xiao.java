package genshinTool.character;
import genshinTool.GenshinCharacter;
public class Xiao extends GenshinCharacter
{
	//魈
	public Xiao(){
		super.HP_BASE = 12736;         //基础生命
		super.ATK_BASE = 349;          //基础攻击力
		super.DEF_BASE = 799;     //基础防御
		super.DMG_BASE = 0.5;    //基础暴击伤害
		super.RATE_BASE = 0.242;    //基础暴击率

		//基础元素/物理伤害加成
		super.Element_DMG_BASE = 0.25 //天赋降魔大圣最高加成
				+ 0.952; //10级大招提供的普通攻击/下落攻击伤害加成
	}

	                
    
	@Override
	public void counter_END()
	{
		// TODO: Implement this method
		HP_END = HP_BASE * ( 1 + HP_W100 + HP_f100 + Sands_HP_100 + Circlet_HP_100 + Goblet_HP_100 + HP_100_items)
			+ Flower_HP //花
			+ HP_f; //小生命加成

		ATK_END = ( ATK_BASE + ATK_W ) * ( 1 + ATK_f100 + Sands_ATK_100 + Circlet_ATK_100 + Goblet_ATK_100 + ATK_W100 + ATK_100_items)
			+ Plume_ATK  //羽毛
			+ ATK_f;  //小攻击

		Defense_END = DEF_BASE * ( 1 + DEF_f100 + Defense_100_items + DEF_100_W + Goblet_DEF_100 + Sands_DEF_100 + Circlet_DEF_100)
				+ DEF_f;

		ELEMENT_MASTER_END = ELEMENT_MASTER_BASE + Element_master_items + Element_Master_f +ELEMENT_MASTER_W + Sands_Elment_master + Goblet_Elment_master + Circlet_Elment_master;

		ATK_DMG_END = Element_DMG_BASE + Goblet_Element_p + Element_p_items + ELEMENT_P_W + ATKDMG_items;
		RATE_END = RATE_BASE + RATE_f + RATE_W + Circlet_RATE;
		DMG_END = DMG_BASE //基础爆伤
			+ DMG_W   //武器
			+ RATE_DMG_f  //圣遗物副词条
			+ Circlet_DMG; //头
		Power_Efficiency_END = Power_Efficiency_BASE + Power_Efficiency_f + Power_Efficiency_items + Power_Efficiency_W + Sands_Power_Efficiency;
		super.counter_END();
	} 
	
}
