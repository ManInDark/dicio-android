package org.stypox.dicio.skills.battery

import android.content.Context
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BatteryStd
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import org.dicio.skill.context.SkillContext
import org.dicio.skill.skill.Skill
import org.dicio.skill.skill.SkillInfo
import org.stypox.dicio.sentences.Sentences.Battery

object BatteryInfo : SkillInfo("battery") {

    override fun name(context: Context): String {
        return "Battery Level"
    }

    override fun sentenceExample(context: Context): String = "What is the battery level?"

    @Composable
    override fun icon(): Painter =
        rememberVectorPainter(Icons.Default.BatteryStd)

    override fun isAvailable(ctx: SkillContext): Boolean {
        return true
    }

    override fun build(ctx: SkillContext): Skill<*> {
        return BatterySkill(BatteryInfo, Battery[ctx.sentencesLanguage]!!)
    }
}