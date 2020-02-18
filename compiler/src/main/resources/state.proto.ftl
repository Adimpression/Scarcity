syntax = "proto3";
package ${filename};

<#list imps as imp>
    import "${imp}";
</#list>

option java_multiple_files = true;

service ToIs${state} { rpc Produce (Not${state}) returns (Is${state}) {} }

message Is${state} {

    Not${state} not = 1;

    <#list ps as p>
    ${p.getRepeatedTokenWithSpace()}.${p.getType()} ${p.getName()} = ${p?index + 100};
    </#list>

    <#list pis as pi>
    ${pi.getRepeatedTokenWithSpace()}${pi.getType()} ${pi.getName()} = ${pi?index + 200};
    </#list>

    <#list spors as pors>
    <#list pors>
    oneof <#list pors as t>${t.getName()}<#sep>_</#sep></#list>{
    <#items as por>
       .${por.getType()} ${por.getName()} = ${pors?index + '' + por?index + '' + 300};
    </#items>
    }
    </#list>
    </#list>
}

message Not${state} {

    Is${state} is = 1;

    <#list cs as c>
    ${c.getRepeatedTokenWithSpace()}.${c.getType()} ${c.getName()} = ${c?index + 100};
    </#list>

    <#list cis as ci>
    ${ci.getRepeatedTokenWithSpace()}${ci.getType()} ${ci.getName()} = ${ci?index + 200};
    </#list>

    <#list scors as cors>
    <#list cors>
    oneof <#list cors as t>${t.getName()}<#sep>_</#sep></#list>{
    <#items as cor>
       .${cor.getType()} ${cor.getName()} = ${cors?index + '' + cor?index + '' +  300};
    </#items>
    }
    </#list>
    </#list>
}
