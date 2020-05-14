import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.RuleSet
import io.gitlab.arturbosch.detekt.api.RuleSetProvider
import rule.MutationRule

class SampleProvider : RuleSetProvider {

    override val ruleSetId: String = "mutation"

    override fun instance(config: Config): RuleSet = RuleSet(
        ruleSetId,
        listOf(
            MutationRule()
        )
    )
}
