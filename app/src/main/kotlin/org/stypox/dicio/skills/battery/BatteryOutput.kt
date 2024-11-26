package org.stypox.dicio.skills.battery

import androidx.compose.runtime.Composable
import org.dicio.skill.context.SkillContext
import org.stypox.dicio.io.graphical.Headline
import org.stypox.dicio.io.graphical.HeadlineSpeechSkillOutput

class BatteryOutput (
    private val batteryLevel: Int,
): HeadlineSpeechSkillOutput {
    override fun getSpeechOutput(ctx: SkillContext): String {
        return "The battery level is $batteryLevel percent."
    }

    @Composable
    override fun GraphicalOutput(ctx: SkillContext) {
        Headline(
            text = "Battery Level: $batteryLevel%",
        )
    }
}