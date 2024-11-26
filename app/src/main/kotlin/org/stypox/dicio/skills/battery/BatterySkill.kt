package org.stypox.dicio.skills.battery

import android.content.Context
import android.os.BatteryManager
import org.dicio.skill.context.SkillContext
import org.dicio.skill.skill.SkillInfo
import org.dicio.skill.skill.SkillOutput
import org.dicio.skill.standard.StandardRecognizerData
import org.dicio.skill.standard.StandardRecognizerSkill
import org.stypox.dicio.sentences.Sentences.Battery

class BatterySkill(correspondingSkillInfo: SkillInfo, data: StandardRecognizerData<Battery>) :
    StandardRecognizerSkill<Battery>(correspondingSkillInfo, data) {

    override suspend fun generateOutput(ctx: SkillContext, inputData: Battery): SkillOutput {
        val bm = ctx.android.getSystemService(Context.BATTERY_SERVICE) as BatteryManager
        return BatteryOutput(bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY))
    }
}